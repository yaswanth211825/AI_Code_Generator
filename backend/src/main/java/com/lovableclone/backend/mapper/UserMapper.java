package com.lovableclone.backend.mapper;

import com.lovableclone.backend.dto.auth.SignupRequest;
import com.lovableclone.backend.dto.auth.UserProfileResponse;
import com.lovableclone.backend.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
