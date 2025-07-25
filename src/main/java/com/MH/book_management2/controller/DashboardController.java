package com.MH.book_management2.controller;

import com.MH.book_management2.model.Dashboard;
import com.MH.book_management2.repository.DashboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DashboardController {
    private final DashboardRepository dashboardRepository;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("count", dashboardRepository.count());

        return "dashboard";
    }
}