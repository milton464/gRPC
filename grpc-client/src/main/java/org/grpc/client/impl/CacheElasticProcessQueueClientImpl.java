package org.grpc.client.impl;

import java.math.BigInteger;
import java.util.Date;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.grpc.client.util.GrpcServerUtil;
import org.olmis.pypepro.dto.CacheElasticProcessQueueDto;
import org.grpc.mapper.CacheElasticProcessQueueMapper;
import org.grpc.proto.CacheElasticProcessQueueIdProtoOuterClass.CacheElasticProcessQueueIdProto;
import org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue;
import org.grpc.proto.CacheElasticProcessQueueServiceGrpc;

import io.grpc.StatusRuntimeException;

/**
 * @author milton
 */
public class CacheElasticProcessQueueClientImpl {
	
	private final CacheElasticProcessQueueServiceGrpc.CacheElasticProcessQueueServiceBlockingStub findStub;
	
	private GrpcServerUtil grpcServerUtil;
	
	/**
	 * 
	 */
	public CacheElasticProcessQueueClientImpl() {
		grpcServerUtil = new GrpcServerUtil();
		//log.info("grpcServerUtil.getChannel() : "+grpcServerUtil.getChannel());
		findStub = CacheElasticProcessQueueServiceGrpc.newBlockingStub(grpcServerUtil.getChannel());
	}
	
	/**
	 * @param cacheElasticProcessQueueDto
	 * @return
	 */
	public BigInteger addCacheElasticProcessQueue(CacheElasticProcessQueueDto cacheElasticProcessQueueDto) {
		CacheElasticProcessQueue cacheElasticProcessQueue = CacheElasticProcessQueueMapper.toCacheElasticProcessQueueProto(cacheElasticProcessQueueDto);
		try {
			CacheElasticProcessQueueIdProto idProtoResponse = findStub.addCacheElasticProcessQueue(cacheElasticProcessQueue);
			if(null != idProtoResponse) {
				return BigInteger.valueOf(idProtoResponse.getId());
			}
			//log.info("idProtoResponse : "+idProtoResponse);
	    } catch (StatusRuntimeException e) {
	    	//log.error(ExceptionUtils.getStackTrace(e));
	    	return null;
	    }
		
		return null;
	}
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		try {
			
			CacheElasticProcessQueueClientImpl client = new CacheElasticProcessQueueClientImpl();
		    CacheElasticProcessQueueDto cacheElasticProcessQueueDto = new CacheElasticProcessQueueDto();
		    cacheElasticProcessQueueDto.setId(BigInteger.valueOf(21424));
		    cacheElasticProcessQueueDto.setAction("ADD");
		    cacheElasticProcessQueueDto.setArchiveStatus((byte)0);
		    cacheElasticProcessQueueDto.setCreatedAt(new Date());
		    cacheElasticProcessQueueDto.setModel("CONTACT");
		    cacheElasticProcessQueueDto.setRequestString("{\"ids\":[11714114],\"model\":\"CONTACT\"}");
		    cacheElasticProcessQueueDto.setStatus((byte)0);
		    cacheElasticProcessQueueDto.setUserId(BigInteger.valueOf(1));
		    cacheElasticProcessQueueDto.setProcessSource((byte)1);
		    cacheElasticProcessQueueDto.setErrorMessage("");
		    
		    BigInteger cacheId = client.addCacheElasticProcessQueue(cacheElasticProcessQueueDto);
		    System.out.print("cacheId : "+cacheId);
		    
		}catch(Exception e) {
			 System.out.print("Error : "+ExceptionUtils.getStackTrace(e));
		    	//log.error("Error: "+ExceptionUtils.getStackTrace(e));
	    }
	}
}
