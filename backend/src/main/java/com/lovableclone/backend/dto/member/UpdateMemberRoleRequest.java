package com.lovableclone.backend.dto.member;

import com.lovableclone.backend.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
