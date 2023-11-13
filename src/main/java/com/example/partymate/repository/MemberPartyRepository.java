package com.example.partymate.repository;

import com.example.partymate.model.MemberParty;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Unagi_zoso
 * @since 2023-10-13
 */
public interface MemberPartyRepository extends JpaRepository<MemberParty, Long>, MemberPartyCustomRepository {
}
