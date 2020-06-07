package mobile.back.demo.search;

import mobile.back.demo.models.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import javax.xml.ws.RequestWrapper;

@Controller
@CrossOrigin("*")
@RequestMapping("/search")
public class SeachController {
    @Autowired
    private SearchResources searchResources;

    @GetMapping("/searchByName")
    public ResponseEntity<ResponseDTO> searchPhone(
            @RequestParam String name
    ) {
        searchResources.setSearchParam(name);
        return new ResponseEntity<ResponseDTO>(searchResources.searchByName(), HttpStatus.ACCEPTED);
    }
}
