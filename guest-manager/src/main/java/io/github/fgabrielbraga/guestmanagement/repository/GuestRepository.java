package io.github.fgabrielbraga.guestmanagement.repository;

import io.github.fgabrielbraga.guestmanagement.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
