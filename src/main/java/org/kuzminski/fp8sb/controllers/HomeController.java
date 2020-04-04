//package org.kuzminski.fp8sb.controllers;
//
//import lombok.RequiredArgsConstructor;
//import org.kuzminski.fp8sb.DAO.UserDAO;
//import org.kuzminski.fp8sb.domain.User;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/home")
//@CrossOrigin
//public class HomeController {
//
//
//    private final UserDAO userDAO;
//
////    @GetMapping("/")
////    public String getHomePage() {
////        return "homePage";
////    }
//
////    @GetMapping("/registration")
////    private String newUserRegistration() {
////        return "newUserRegistrationForm";
////    }
////
////    @PostMapping(path = "/registration")
////    private String addNewUser(@RequestParam String user_name,
////                              @RequestParam String user_surname,
////                              @RequestParam String user_email,
////                              @RequestParam String user_password) {
////
////        User user = new User();
////        user.setUser_name(user_name);
////        user.setUser_surname(user_surname);
////        user.setUser_email(user_email);
////        user.setUser_password(user_password);
////        userDAO.save(user);
//////        model.addAttribute("message", "saved");
////        return "mainMenu";
////    }
//
//    @GetMapping("/search")
//    @ResponseStatus(HttpStatus.OK)
//    private ResponseEntity<List<User>> getSearchPage() {
//        return new ResponseEntity(userDAO.findAll(), HttpStatus.OK);
//    }
////    @GetMapping(path = "/search")
////    private String findUserByName(@RequestParam String tag, Map<String, Object> model) {
////        List<User> users = userDAO.findByUser_name(tag);
////        model.put("messages", users);
////
////        return "FindUser";
////    }
//
//}
