package org.grpc.server.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.olmis.pypepro.dto.CacheElasticProcessQueueDto;
import org.grpc.mapper.CacheElasticProcessQueueMapper;
import org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto;
import org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue;
import org.grpc.proto.CacheElasticProcessQueueServiceGrpc.CacheElasticProcessQueueServiceImplBase;
import org.grpc.proto.EmptyOuterClass.Empty;
import org.grpc.proto.IdListProtoOuterClass.IdListProto;
import org.grpc.proto.IdProtoOuterClass.IdProto;
import org.olmis.pypepro.service.CacheElasticProcessQueueService;
import org.olmis.pypepro.service.ServiceFactory;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author milton
 */
@GrpcService
public class GrpcCacheElasticProcessQueueServiceImpl extends CacheElasticProcessQueueServiceImplBase {

	private CacheElasticProcessQueueService cacheElasticProcessQueueService;

	public GrpcCacheElasticProcessQueueServiceImpl() {
		if (cacheElasticProcessQueueService == null) {
			cacheElasticProcessQueueService = ServiceFactory.getServiceInstance(CacheElasticProcessQueueService.class);
		}
	}

	
	@Override
	public void addCacheElasticProcessQueue(CacheElasticProcessQueue request, StreamObserver<CacheElasticProcessQueueIdProto> responseObserver) {
		BigInteger id = cacheElasticProcessQueueService.addCacheElasticProcessQueue(CacheElasticProcessQueueMapper.toCacheElasticProcessQueueDto(request));
		System.out.print("id : "+id);
		CacheElasticProcessQueueIdProto idProto = CacheElasticProcessQueueIdProto.newBuilder().setId(id.longValue()).build();
		responseObserver.onNext(idProto);
		responseObserver.onCompleted();
	}

	@Override
	public void findQueued(Empty request, StreamObserver<IdListProto> responseObserver) {
		List<BigInteger> idList = cacheElasticProcessQueueService.findQueued();
		IdListProto idListProto = IdListProto.newBuilder().addAllId(getLongListFromBigIntList(idList)).build();
		responseObserver.onNext(idListProto);
		responseObserver.onCompleted();
	}

	@Override
	public void getCacheElasticProcessQueue(IdProto request, StreamObserver<CacheElasticProcessQueue> responseObserver) {
		CacheElasticProcessQueueDto dto = cacheElasticProcessQueueService.getCacheElasticProcessQueue(BigInteger.valueOf(request.getId()));
		responseObserver.onNext(CacheElasticProcessQueueMapper.toCacheElasticProcessQueueProto(dto));
		responseObserver.onCompleted();
	}

	@Override
	public void findHangingIds(Empty request, StreamObserver<IdListProto> responseObserver) {
		List<BigInteger> idList = cacheElasticProcessQueueService.findHangingIds();
		IdListProto idListProto = IdListProto.newBuilder().addAllId(getLongListFromBigIntList(idList)).build();
		responseObserver.onNext(idListProto);
		responseObserver.onCompleted();
		
	}

	@Override
	public void queuedHangingById(IdProto request, StreamObserver<Empty> responseObserver) {
		cacheElasticProcessQueueService.getCacheElasticProcessQueue(BigInteger.valueOf(request.getId()));
		responseObserver.onNext(Empty.newBuilder().build());
		responseObserver.onCompleted();
	}

	private List<Long> getLongListFromBigIntList(List<BigInteger> bigIntList) {
		List<Long> idLongList = new ArrayList<>(bigIntList.size());
		for (BigInteger id : bigIntList) {
			idLongList.add(id.longValue());
		}
		return idLongList;
	}

}
