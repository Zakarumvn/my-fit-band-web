import { Component, OnInit } from '@angular/core';
import { WorkoutService } from 'app/workouts/workout.service';

@Component({
    selector: 'jhi-workouts',
    templateUrl: './workouts.component.html',
    styles: []
})
export class WorkoutsComponent implements OnInit {
    workoutList: any = {};

    constructor(private workoutService: WorkoutService) {}

    ngOnInit() {
        this.getWorkoutList();
    }

    getWorkoutList() {
        this.workoutList = this.workoutService.getWorkoutList();
    }
}
