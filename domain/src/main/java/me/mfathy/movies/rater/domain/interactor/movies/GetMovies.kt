package me.mfathy.movies.rater.domain.interactor.movies

import io.reactivex.Flowable
import me.mfathy.movies.rater.domain.executor.ExecutionThread
import me.mfathy.movies.rater.domain.interactor.base.FlowableUseCase
import me.mfathy.movies.rater.domain.model.MovieEntity
import me.mfathy.movies.rater.domain.repository.MoviesRepository
import javax.inject.Inject

/**
 * Created by Mohammed Fathy on 11/01/2019.
 * dev.mfathy@gmail.com
 */
open class GetMovies @Inject constructor(
    private val dataRepository: MoviesRepository,
    subscriberThread: ExecutionThread,
    postExecutionThread: ExecutionThread
) : FlowableUseCase<MutableList<MovieEntity>>(subscriberThread, postExecutionThread) {
    public override fun buildUseCaseObservable(): Flowable<MutableList<MovieEntity>> {
        return dataRepository.getMovies()
    }
}