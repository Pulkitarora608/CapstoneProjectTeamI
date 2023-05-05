package com.incedo.smartinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.incedo.smartinventory.entity.Return;
import com.incedo.smartinventory.service.ReturnService;

@RestController
@CrossOrigin
public class ReturnController {
@Autowired
private ReturnService returnService;

@PostMapping("/addReturn")
public Return addReturn(@RequestBody Return returns) {
return returnService.addReturn(returns);
}


@PostMapping("/addReturns")
public List<Return> addReturns(@RequestBody List<Return> returns) {
return returnService.addReturns(returns);
}

@GetMapping("/returns")
public List<Return> getAllReturns() {
return returnService.getAllReturns();
}

@GetMapping("/returns/{id}")
public Return getReturn(@PathVariable Long id) {
return returnService.getReturn(id);
}


@PutMapping("/updatereturn")
public Return updateReturn(@RequestBody Return returns) {

return returnService.updateReturn(returns);
}

@DeleteMapping("/deletereturn/{id}")
public String deleteReturn(@PathVariable Long id) {
return returnService.deleteReturn(id);

}


}