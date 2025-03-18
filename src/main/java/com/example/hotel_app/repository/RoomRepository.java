package com.example.hotel_app.repository;

import com.example.hotel_app.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
