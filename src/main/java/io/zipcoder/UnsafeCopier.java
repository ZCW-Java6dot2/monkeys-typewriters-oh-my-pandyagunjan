package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {
  private StringBuilder sb;
    public UnsafeCopier(String toCopy) {
        super(toCopy);

    }

    public void run() {
        while (stringIterator.hasNext()) {
            copied += stringIterator.next() + " ";
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("UNSAFE: "+ Thread.currentThread().getName());
        }
    }
}