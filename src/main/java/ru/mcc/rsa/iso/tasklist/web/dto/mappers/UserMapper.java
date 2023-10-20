package ru.mcc.rsa.iso.tasklist.web.dto.mappers;

import org.mapstruct.Mapper;
import ru.mcc.rsa.iso.tasklist.domain.user.User;
import ru.mcc.rsa.iso.tasklist.web.dto.user.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);

}
