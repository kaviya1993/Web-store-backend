package mobile.back.demo.search;

import mobile.back.demo.models.ResponseDTO;

public interface SearchResources {
    void setSearchParam(String name);

    ResponseDTO searchByName();
    
}
