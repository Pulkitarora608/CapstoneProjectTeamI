package com.incedo.smartinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.smartinventory.entity.Return;
import com.incedo.smartinventory.repository.ReturnRepository;

@Service
public class ReturnService {


@Autowired
private ReturnRepository returnRepository;

public List<Return> getAllReturns() {
return returnRepository.findAll();
}

public Return getReturn(Long id) {
return returnRepository.findById(id).get();
}

public Return addReturn(Return returns) {
return returnRepository.save(returns); 

}

public List<Return> addReturns(List<Return> returns) {
return returnRepository.saveAll(returns);
}

public Return updateReturn(Return returns) {
Return existingReturn=returnRepository.findById(returns.getItem_id()).orElse(null);
existingReturn.setItem_name(returns.getItem_name());
existingReturn.setItem_quantity(returns.getItem_quantity());
existingReturn.setReason_for_return(returns.getReason_for_return());

return returnRepository.save(existingReturn) ;
}

public String deleteReturn(long id) {
returnRepository.deleteById(id);
return "Return removed !! "+id;
}

}