package com.ms.userApi.mapper;

import com.ms.userApi.dto.request.UserRequest;
import com.ms.userApi.dto.response.UserResponse;
import com.ms.userApi.entitie.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toEntity(UserRequest userRequest);

    UserResponse toResponse(User user);
}
