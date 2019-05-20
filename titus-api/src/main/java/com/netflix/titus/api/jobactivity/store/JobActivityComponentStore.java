package com.netflix.titus.api.jobactivity.store;

import com.netflix.titus.api.jobmanager.model.CallMetadata;
import com.netflix.titus.api.jobmanager.model.job.Job;
import com.netflix.titus.api.jobmanager.model.job.Task;
import reactor.core.publisher.Mono;

public interface JobActivityComponentStore {
    // runs the get job query
    Mono<Void> getJobActivity(Job<?> job, CallMetadata callMetadata);

    // runs the get task query
    Mono<Void> getTaskActivity(Task task, CallMetadata callMetadata);
}
