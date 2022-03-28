import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_8 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(5, 10, 30);
        intStream
                .limit(5)
                .forEach(System.out::println);


        Path path = FileSystems.getDefault().getPath("./ch14");
        try {
            Stream<Path> pathStream = Files.list(path);
            pathStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(FileSystems.getDefault());
    }
}