package corejava.collection.assignmentset3.mapper;

import corejava.collection.assignmentset3.model.Server;

public class ServerMapper {
    public static Server map(String serverData) {
    	if(serverData == null || serverData.length() == 0) {
    		throw new RuntimeException("Null or empty input");
    	}
        String[] serverArray = serverData.split(", ");
        if(serverArray.length != 4) {
        	throw new RuntimeException("Invalid number of values");
        }
        String server = serverArray[0];
        String platform = serverArray[1];
        String software = serverArray[2];
        String version = serverArray[3];

        Server server1 = new Server(server, platform, software, version);
        return server1;
    }
}
