package org.grpc.mapper;

import java.math.BigInteger;

import org.grpc.proto.CacheElasticProcessQueueOuterClass.CacheElasticProcessQueue;
import org.olmis.date_time_util.DateTimeFormatConstants;
import org.olmis.date_time_util.DateTimeUtil;
import org.olmis.pypepro.dto.CacheElasticProcessQueueDto;

/**
 * @author milton
 */
public class CacheElasticProcessQueueMapper {

	public CacheElasticProcessQueueMapper() {

	}

	/**
	 * @param proto
	 * @return
	 */
	public static CacheElasticProcessQueueDto toCacheElasticProcessQueueDto(CacheElasticProcessQueue proto) {
		CacheElasticProcessQueueDto dto = new CacheElasticProcessQueueDto();
		dto.setArchiveStatus(Byte.valueOf(proto.getArchiveStatus() + ""));
		dto.setStatus(Byte.valueOf(proto.getStatus() + ""));
		dto.setProcessSource(Byte.valueOf(proto.getProcessSource() + ""));
		dto.setErrorMessage(proto.getErrorMessage());
		dto.setAction(proto.getAction());
		dto.setModel(proto.getModel());
		dto.setRequestString(proto.getRequestString());
		dto.setUserId(BigInteger.valueOf(proto.getUserId()));

		if (proto.getCreatedAt() != null) {
			dto.setCreatedAt(
					DateTimeUtil.parseDate(proto.getCreatedAt(), DateTimeFormatConstants.ISO_DATETIME_FORMAT_NO_T));
		}
		if (proto.getUpdatedAt() != null) {
			dto.setUpdatedAt(
					DateTimeUtil.parseDate(proto.getUpdatedAt(), DateTimeFormatConstants.ISO_DATETIME_FORMAT_NO_T));
		}
		return dto;
	}
	
	/**
	 * @param cacheElasticProcessQueueDto
	 * @return
	 */
	public static CacheElasticProcessQueue toCacheElasticProcessQueueProto(CacheElasticProcessQueueDto cacheElasticProcessQueueDto) {
		return CacheElasticProcessQueue.newBuilder()
				.setId(cacheElasticProcessQueueDto.getId().longValue())
				.setArchiveStatus(cacheElasticProcessQueueDto.getArchiveStatus().intValue())
				.setStatus(cacheElasticProcessQueueDto.getStatus().intValue())
				.setProcessSource(cacheElasticProcessQueueDto.getProcessSource().intValue())
				.setErrorMessage(cacheElasticProcessQueueDto.getErrorMessage())
				.setAction(cacheElasticProcessQueueDto.getAction())
				.setModel(cacheElasticProcessQueueDto.getModel())
				.setRequestString(cacheElasticProcessQueueDto.getRequestString())
				.setUserId(cacheElasticProcessQueueDto.getUserId().longValue())
				.build();
	}

}
