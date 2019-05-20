package com.netflix.titus.api.jobactivity.store;

import com.netflix.titus.api.jobmanager.model.CallMetadata;
import com.netflix.titus.api.jobmanager.model.job.Job;
import com.netflix.titus.api.jobmanager.model.job.Task;
import reactor.core.publisher.Mono;

public interface JobActivityConsumerStore {
    // Consumes a single job record
    Mono<Void> consumeJob(Job<?> job, CallMetadata callMetadata);

    // Consumes a single task record
    Mono<Void> consumeTask(Task task, CallMetadata callMetadata);
}
