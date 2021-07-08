import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer{
    List<Integer> queue;
    int limit;
    ProducerConsumer(List<Integer> q, int lim) {
        queue = q;
        limit = lim;
    }

    class Producer {
        public void produce(){
            if(queue.size()<limit) {
                queue.add(getRandom());
            }
        }

        private int getRandom(){
            Random random = new Random();
            return random.ints(0,(100+1)).findFirst().getAsInt();
        }
    }

    class Consumer {

    }
}

class ForImpl {
    public static void main(String[] args) {
        List<Integer> queue = new ArrayList();
        ProducerConsumer consumer = new ProducerConsumer(queue, 10);
    }
}