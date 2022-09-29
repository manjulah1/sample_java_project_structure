package corejava.collection.assignmentset3.inputparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import corejava.collection.assignmentset3.mapper.ServerMapper;
import corejava.collection.assignmentset3.model.Server;

public class ServerInputParser {

	public List<Server> parseArray(final String[] inputData) {
		List<Server> list = new ArrayList<>();
		for (String data : inputData) {
			Server Server = ServerMapper.map(data);
			list.add(Server);
		}
		return list;
	}

	public List<Server> parseCSVFile(String filePath) {
		List<Server> list = new ArrayList<>();
		try(FileReader fr = new FileReader(filePath)) {
			BufferedReader bufferedReader = new BufferedReader(fr);
			String line;
			while ((line = bufferedReader.readLine()) != null) {

				Server Server = ServerMapper.map(line);
				if (Server != null) {
					list.add(Server);
				}
			}
		} catch (IOException ioException) {
			throw new RuntimeException(ioException);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return list;
	}

}
