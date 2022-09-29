package corejava.collection.assignmentset3.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import corejava.collection.assignmentset3.model.Server;

public class ServerService {
	private List<Server> servers;

	public ServerService(List<Server> servers) {
		this.servers = servers;
	}

	public List<Server> getSortedListOnServerNameSoftwareVersion() {
		List<Server> sortedServers = servers.stream()
				.sorted(Comparator.comparing(Server::getServer)
				.thenComparing(Server::getSoftware)
				.thenComparing(Server::getVersion))
				.collect(Collectors.toList());

		return sortedServers;
	}
}
