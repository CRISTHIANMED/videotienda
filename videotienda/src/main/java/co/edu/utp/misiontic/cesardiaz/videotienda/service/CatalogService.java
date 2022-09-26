package co.edu.utp.misiontic.cesardiaz.videotienda.service;

import java.util.List;
import java.util.Optional;

import co.edu.utp.misiontic.cesardiaz.videotienda.controller.dto.CategoryDto;
import co.edu.utp.misiontic.cesardiaz.videotienda.controller.dto.MovieDto;

public interface CatalogService {

    List<CategoryDto> getCategory();

    Optional<CategoryDto> getCategoryById(Integer id);

    List<MovieDto> getMoviesByCategoryId(Integer CategoryId);  
}
