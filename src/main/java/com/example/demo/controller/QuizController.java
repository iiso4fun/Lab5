package com.example.demo.controller;

import com.example.demo.model.QuizQuestion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping("/questions")
    public List<QuizQuestion> getQuizQuestions() {
        List<QuizQuestion> quizQuestions = new ArrayList<>();

        quizQuestions.add(new QuizQuestion(
                "Who is the all-time leading scorer in NBA history?",
                new String[]{"LeBron James", "Kareem Abdul-Jabbar", "Michael Jordan", "Kobe Bryant"},
                "LeBron James"));

        quizQuestions.add(new QuizQuestion(
                "Which team has won the most NBA championships?",
                new String[]{"Boston Celtics", "Los Angeles Lakers", "Chicago Bulls", "Golden State Warriors"},
                "Boston Celtics"));

        quizQuestions.add(new QuizQuestion(
                "Which player is known as 'The Black Mamba'?",
                new String[]{"Michael Jordan", "Shaquille O'Neal", "Kobe Bryant", "Allen Iverson"},
                "Kobe Bryant"));

        quizQuestions.add(new QuizQuestion(
                "What team did Michael Jordan play for after his second retirement?",
                new String[]{"Chicago Bulls", "Washington Wizards", "Miami Heat", "New York Knicks"},
                "Washington Wizards"));

        quizQuestions.add(new QuizQuestion(
                "Who won the NBA MVP award in 2021?",
                new String[]{"LeBron James", "Giannis Antetokounmpo", "Nikola Jokic", "Kevin Durant"},
                "Nikola Jokic"));

        return quizQuestions;
    }
}
