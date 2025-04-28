    package com.rg.Book.management.system.service;

    import com.rg.Book.management.system.model.Books;
    import com.rg.Book.management.system.repo.BooksRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;
    import java.util.Optional;

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

        public boolean deleteBooks(Long id) {
            if(booksRepo.existsById(id)){
                booksRepo.deleteById(id);
                return true;
            }
            return false;
        }

        public Books updateBook(Long id, Books books) {
            Books found_book=null;
            if(booksRepo.existsById(id)) {
                found_book = booksRepo.findById(id).get();
//                Not needed
//                found_book.setId(books.getId());
                found_book.setIsbn(books.getIsbn());
                found_book.setAuthor(books.getAuthor());
                found_book.setTitle(books.getTitle());
                return booksRepo.save(found_book);
            }
            return found_book;
        }
    }
