package testJava;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadsInJava
{
    public static void main(String[] args)
    {
        
        final Shared s1 = new Shared();
 
        final Shared s2 = new Shared();
 
        Thread t1 = new Thread()
        {
            public void run()
            {
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s2.methodTwo(s1);
            }
        };
 
        t1.start();
 
        t2.start();
 
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
 
        long ids[] = bean.findMonitorDeadlockedThreads();
 
        if(ids != null)
        {
            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
 
            for (ThreadInfo threadInfo1 : threadInfo)
            {
                System.out.println("Prints the ID of deadlocked thread:  "+threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
 
                System.out.println("Prints the Name of deadlocked thread:  "+threadInfo1.getThreadName());  //Prints the name of deadlocked thread
 
                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
 
                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
 
                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
            }
        }
        else
        {
            System.out.println("No Deadlocked Threads");
        }
    }
}