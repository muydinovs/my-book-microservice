package uz.pdp.book_review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import uz.pdp.book_review.entity.BookReview;
import uz.pdp.book_review.service.BookReviewService;

@RestController
@RequestMapping("/api/book-review")
public class BookReviewController {

    @Autowired
    BookReviewService bookReviewService;

    @GetMapping
    public HttpEntity<?> getAllBookReviews() {
        return bookReviewService.getAllBookReviews();
    }

    @GetMapping("/{id}")
    public HttpEntity<?> getBookReviewById(@PathVariable int id) {
        return bookReviewService.getBookReviewById(id);
    }

    @PostMapping
    public HttpEntity<?> save(@RequestBody BookReview bookReview) {
        return bookReviewService.save(bookReview);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteBookReviewById(@PathVariable int id) {
        return bookReviewService.delete(id);
    }
}
