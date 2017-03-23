package concurrency;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by anandran on 3/13/17.
 */
public class OneShotLatch {

        private Sync sync = new Sync();

        public void signal(){
            sync.releaseShared(0);
        }

        public void await() throws InterruptedException {
            sync.acquireSharedInterruptibly(0);
        }

    private class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected int tryAcquireShared(int shared){
            return getState()==1? 1:-1;
        }

        protected boolean tryReleaseShared(int ignored){
            setState(1);
            return true;
        }
    }
}
