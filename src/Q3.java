import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.concurrent.Future;

public class Q3 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\jeffrey.samuel\\IdeaProjects\\Workshop2\\src\\Q3.txt");

        try (AsynchronousFileChannel asyncFileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            long position = 0;

            Future<Integer> operation = asyncFileChannel.read(buffer, position);

            while(!operation.isDone());

            buffer.flip();
            byte[] data = new byte[buffer.limit()];
            buffer.get(data);
            System.out.println(new String(data));
            buffer.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
