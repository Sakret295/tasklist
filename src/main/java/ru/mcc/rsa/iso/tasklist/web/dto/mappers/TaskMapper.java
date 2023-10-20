package ru.mcc.rsa.iso.tasklist.web.dto.mappers;

import org.mapstruct.Mapper;
import ru.mcc.rsa.iso.tasklist.domain.task.Task;
import ru.mcc.rsa.iso.tasklist.web.dto.task.TaskDTO;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO toDTO(Task task);

    List<TaskDTO> toDTO(List<Task> tasks);

    Task toEntity(TaskDTO taskDTO);
}
