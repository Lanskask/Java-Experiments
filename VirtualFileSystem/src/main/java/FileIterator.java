import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by a1 on 18.04.17.
 */
public class FileIterator implements Iterator<String> {

    private Queue<File> files = new LinkedList<File>();

    public FileIterator(Queue<File> files) {
        this.files = files;
    }

    @Override
    public boolean hasNext() {
        return !files.isEmpty();
    }

    @Override
    public String next() {
        File file = files.peek();
        if(file.isDirectory()) {
            for (File subFile : file.listFiles()) {
                this.files.add(subFile);
            }
        }
        return files.poll().getAbsolutePath();
    }
}
