package agatakasia.zpp.web.rest.workouts;

import agatakasia.zpp.domain.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController("/workouts")
public class WorkoutController {

    @GetMapping("/list")
    public List<Workout> getWorkoutList(){
        List<Workout> workoutList = new ArrayList<>();
        workoutList.add(new Workout(1, LocalDateTime.now(),  LocalDateTime.now(), "bieganie"));
        workoutList.add(new Workout(2, LocalDateTime.now(),  LocalDateTime.now(), "jazda rowerem"));
        workoutList.add(new Workout(3, LocalDateTime.now(),  LocalDateTime.now(), "bieganie"));
        workoutList.add(new Workout(4, LocalDateTime.now(),  LocalDateTime.now(), "jazda rowerem"));
        return workoutList;
    }
}
