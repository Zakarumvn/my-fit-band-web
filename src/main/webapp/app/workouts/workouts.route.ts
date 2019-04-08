import { Route } from '@angular/router';

import { WorkoutsComponent } from './workouts.component';

export const workoutsRoute: Route = {
    path: 'workouts',
    component: WorkoutsComponent,
    data: {
        pageTitle: 'Lista treningów'
    }
};
