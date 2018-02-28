import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

import "rxjs/add/operator/map"

@Injectable()
export class TaskService {

    constructor(private http: HttpClient) {
    }

    getTasks() {
        return this.http.get('/api/tasks').map(response => response);
    }
}