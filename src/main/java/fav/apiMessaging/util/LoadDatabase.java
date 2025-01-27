//package fav.apiMessaging.util;
//
//
//import fav.apiMessaging.model.Message;
//import fav.apiMessaging.repository.MessageRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class LoadDatabase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(MessageRepository repository){
//        return args -> {
//            log.info("Preloading " + repository.save(new Message("sd")));
//            log.info("Preloading " + repository.save(new Message("4.04 5/5")));
//        };
//    }
//
//}
