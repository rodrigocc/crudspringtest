package teste.com.example.crudtest;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public double getUserSaldo(@PathVariable Long id ){

        return userRepository.findById(id).get().saldo;

    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);

    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userRepository.findById(id).get();
    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){

        userRepository.deleteById(id);
    }





}
