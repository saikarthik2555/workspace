package notes;

public class Points {
	

}
/*
 * 
 * Interview QnA for Multithreading :
--------------------------------------
Multitasking and multithreading ? 
1) What is a Thread ? 
--> Light weight process of CPU. Independent Execution .Can Work concurrently with another Thread

2) What is the default thread present in the JVM?
-->		main

3) How can we make our own user thread ?
--> By 

4) How many ways we can create user Thread ? 
  ->	1 way to create thread---> object of Thread class
  ->	3 ways to implement out own logic--->
      imp ----->Runnable
      imp ----->Callable
      ext------>Thread
  ->	10 ways we can execute our logic ---->
     ->Create object of implemented sub class  pass that   object to the thread constructor at the time of instanitiating thread object...Runnable
      ->Create object of implemented sub class  pass that   object to the thread constructor at the time of instanitiating thread object...Callable
      -> Override run method 
      ->Anonymous Inner Class(AIC) for runnable
      ->AIC for callable
      ->AIC for Thread
      ->lambda express for Runnable
      ->lambda express for Callable
      ->Method Reference :: for Runnable		26/12/23   google classroom
      ->MR :: for Callable
     
5) Which thread creation is a best approach to our program ?
--> Runnable()

6) Can we overload run() method ?
--> yes
   -> What is target in thread class ?
   
7) Can we pass thread class object to a thread class constructor ?
--> Yes, But no output

8) When we instantiate a thread but not calling the start() method
 then the thread is in which state ? 
 --> NEW STATE
9) Is the thread alive when it is at new state ? 
--> No
10) What is the work of isAlive() method ?
--> To check wether a thread is alive or not

11) When we can say a thread is alive ?
--> when the thread is in waiting , sleeping and join() .

12) What is the work of start() method ?
Ans : -> A new thread of execution starts.
      -> The thread moves from the new state to runnable state.
      -> When a thread gets chance to executes its targets run method will run.
     //my answer
      * the Thread will make a request to JVM to assign new task;
      * JVM asks the system for environment to assign a thread
 
 13) Can we call run method directly , if yes then what will happen ?
--> Yes, we can call run ethod directly but new thread is not created
//run method executes.
 * 
14) What is the work of getName() method ?
--> public final native String getName();
--> As we user can modify the Thread name so return type is String  not State

15) What is the work of currentThread() method ?
--> This will specify the current Excecution Thread
--> public static Thread currentThread();

16) If we create multiple thread at a time then which thread will will exexutes when it depends on ______________ ? 
--> Thread Schedular is responcible to select particular thread and send to running state

17) if start() method called for multiple threads then can we guarantee the thread execution order ?
--> No, we cannot predict the output/exceution order unless by using wait(),sleep(),join().
 
18) What is the way that we can tell to other thread to not start untill one thread completes its run ?
--> Exception --> IllegalThreadStateException
//because after run method() the thread goes to dead state by thread schedular
//and when we start() one thread two times leads to exception.
 
19) When a thread completes its execution of run() then the thread will be in which state ?
--> dead State/terminated State

20) When the thread is dead/terminated then is the thread object destroyed ? 
-->
21) ONCE A THREAD HAS BEEN STARTED , IT CAN NEVER BE STARTED AGAIN ?
//Yes, Exception --> IllegalThreadStateException
//because after run method() the thread goes to dead state by thread schedular
//and when we start() one thread two times leads to exception.
 
22) If you call start() method over a alive/dead thread then what will happen ? 
-->Exception IllegalThreadStateException

23) What is the work of getName(), setName() and getId() ?
--> getName()--> for name 
-->setName()--> to set name of thread

24) What is thread Scheduler ? 
--> it is responciple to select parituclar thread and send to running state

25) Thread Schedular is picking all the thread from which state ?
--> NEW BORN state

26) THE ORDER IN WHICH RUNNABLE THREADS ARE CHOOSEN TO RUN IS NOT GUARANTEED.

27) What is qeue behavior and runnable pool ? 

28) Can we control the thread scheduler ?
//
29) What methods are available to influence thread scheduler? 
    java.lang.Thread Class ----> (sleep(),yield(),join(),setPriority())
    
    java.lang.Object Class ----> (wait(),notify(),notifyAll())
    wait() , sleep(), join() has overload method.
30) How many Thread states are there ? 
    Before java5v : 
    I)   NEW
    II)  RUNNABLE
    III) RUNNING
    IV)  WAITING/BLOCKED/SLEEPING
    V)   DEAD

    Since java5v : 
    I)   NEW
    II)  RUNNABLE
    III) WAITING
    IV)  TIMED WAITING
    V)   BLOCKED
    VI)  TERMINATED//
31) What is the work of getState() method ?
Thread t=nwew Thread();
t.sleep(1000);
public string void() getName()32) Write a program to show all the above states by using getState() method ?

33) From the above state in which state we can say the thread is alive ? 
 --> Waiting state, sleep state, join (waiting stread)"; 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 * */
 