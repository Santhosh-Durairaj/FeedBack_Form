package com.santhos.santhos_feedbackform;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
