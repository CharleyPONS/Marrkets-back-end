package com.info.markets.core.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UtilsMapping {
    private final ModelMapper modelMapper;

    public UtilsMapping(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public <S, T> List<T> ConvertEntityToDTO(List<S> source, Class<T> target) {
        return source.stream()
                .map(element -> this.modelMapper.map(element, target))
                .collect(Collectors.toList());
    }
}