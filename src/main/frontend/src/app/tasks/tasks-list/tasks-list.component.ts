import {Component, OnInit} from '@angular/core';
import {Task} from "../task.model";

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks:Task[] = [];

    constructor() {
    }

    ngOnInit() {
        this.tasks.push(new Task(1, "Task 1", true, "01/02/2018"))
        this.tasks.push(new Task(2, "Task 2", false, "01/02/2018"))
        this.tasks.push(new Task(3, "Task 3", false, "01/02/2018"))
    }


    onTaskChange(event, task: Task) {
        // this.taskService.saveTask(task, event.target.checked).subscribe();
        console.log('Task has changed');
    }

    getDueDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }
}
