package mobile.back.demo.search;

import mobile.back.demo.models.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchResourcesImpl implements SearchResources {
    private String searchParam;

    @Autowired
    private PhoneSearchRepo phoneSearchRepo;

    @Override
    public void setSearchParam(String name) {
        this.searchParam = name;
    }

    @Override
    public ResponseDTO searchByName() {
        try {
            List<MobileEntity> allByNameContaining = phoneSearchRepo.findAllByNameContaining(this.searchParam);

            return new ResponseDTO("success", allByNameContaining);
        }catch (Exception e){
            return new ResponseDTO("fail",e.toString());
        }
    }
}
