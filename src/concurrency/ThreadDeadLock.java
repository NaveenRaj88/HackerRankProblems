package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by anandran on 3/6/17.
 */
public class ThreadDeadLock {

    static ExecutorService executorService = Executors.newFixedThreadPool(1);

    static class RenderPage implements Callable<String>{

        @Override
        public String call() throws Exception {
            Future<String> header, footer;
            header = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "Header";
                }
            });
            footer = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
//                    TimeUnit.SECONDS.sleep(1);
                    return "Footer";
                }
            });

            String page = "Body";
            return header.get() + page + footer.get();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println(executorService.submit(new RenderPage()).get(5, TimeUnit.SECONDS));
        executorService.shutdownNow();
    }



}
