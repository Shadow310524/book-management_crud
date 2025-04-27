    package com.rg.Book.management.system.service;

    import com.rg.Book.management.system.model.Books;
    import com.rg.Book.management.system.repo.BooksRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class BookService {
        @Autowired
        private BooksRepository booksRepo;
        public Books create(Books books) {
            return booksRepo.save(books);
        }

        public List<Books> getAll() {
            return booksRepo.findAll();
        }
    }
