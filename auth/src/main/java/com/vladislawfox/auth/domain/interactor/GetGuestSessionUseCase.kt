package com.vladislawfox.auth.domain.interactor

import com.vladislawfox.auth.domain.model.GuestSession
import com.vladislawfox.auth.domain.repository.AuthRepository
import com.vladislawfox.base.exception.Failure
import com.vladislawfox.base.functional.Either
import com.vladislawfox.base.interactor.UseCaseWithoutParams
import javax.inject.Inject

/**
 * Created by vladislawfox on 1/18/19.
 */
class GetGuestSessionUseCase @Inject constructor(private val authRepository: AuthRepository) :
    UseCaseWithoutParams<GuestSession>() {
    override suspend fun run(): Either<Failure, GuestSession> {
        return authRepository.getGuestSession()
    }
}