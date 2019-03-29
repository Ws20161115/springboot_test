package com.sss.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncTaskService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/27 12:53
 * @Version 1.0
 **/
@Service
@Async
public class AsyncTaskService {

    public void executeAsyncTask(Integer integer){
        System.out.println("异步执行任务:"+integer);
    }

    public void executeAsyncTaskPlus(Integer integer){
        System.out.println("异步执行任务Plus:"+(integer+1));
    }
}
