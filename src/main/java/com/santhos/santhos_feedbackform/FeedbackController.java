package com.santhos.santhos_feedbackform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping
    public RedirectView submitFeedback(@RequestParam String name, @RequestParam String bookName, @RequestParam String feedback) {
        Feedback feedbackEntity = new Feedback();
        feedbackEntity.setName(name);
        feedbackEntity.setBookName(bookName);
        feedbackEntity.setFeedback(feedback);
        feedbackRepository.save(feedbackEntity);
        return new RedirectView("/success.html");
    }
}
