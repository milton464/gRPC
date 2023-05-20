package org.grpc.client.util;

import org.apache.commons.lang3.StringUtils;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author milton
 */
public class GrpcServerUtil {
	
	private ManagedChannel channel;
	
	private String grpcServerIp = "localhost";
	
	private String grpcServerPort = "6565";
	
	private String targetServer;

	public GrpcServerUtil() {
		targetServer = grpcServerIp + ":" + grpcServerPort;
	}
	
	public ManagedChannel getChannel() {
		if(StringUtils.isNotBlank(targetServer)) {
			//log.info("grpcTargetServer : "+targetServer);
			channel = ManagedChannelBuilder.forTarget(targetServer)
			        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
			        // needing certificates.
			        .usePlaintext()
			        .build();
		}
		return channel;
	}

	public static void main(String[] args) {
		
	};

}
