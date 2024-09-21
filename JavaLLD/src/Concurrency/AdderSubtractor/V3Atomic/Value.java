package Concurrency.AdderSubtractor.V3Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {


    AtomicInteger num = new AtomicInteger(0);


}


// CAS : Compare and swap

// t <- value 0              t <- value 0 , x <- value
// t = t + i  1              t = t - i -1
// t -> value  1             if (value == x)
//                              t -> value -1
//                           else
//                                tryAgain();