package driving.school.web.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import driving.school.web.app.dao.StatisticsDao;
import driving.school.web.app.entity.Statistics;
import driving.school.web.app.exceptions.DataNotFoundException;
import driving.school.web.app.utilLib.UtilLib;

@Service
public class StatisticsServiceImpl implements StatisticsService {
	@Autowired
	private StatisticsDao statisticsDao;

	@Transactional(readOnly = true)
	@Override
	public Statistics getMaleFemaleLast3Years() throws DataNotFoundException {

		Statistics statistics = statisticsDao.getMaleFemaleLast3Years();

		if (UtilLib.isEmpty(statistics)) {
			throw new DataNotFoundException("No statistics retrieved");
		}
		return statistics;
	}

	@Transactional(readOnly = true)
	@Override
	public Statistics getMaleFemaleThisYear() throws DataNotFoundException {

		Statistics statistics = statisticsDao.getMaleFemaleThisYear();

		if (UtilLib.isEmpty(statistics)) {
			throw new DataNotFoundException("No statistics retrieved");
		}
		return statistics;
	}

	@Transactional(readOnly = true)
	@Override
	public Statistics getLicensesThisYear() throws DataNotFoundException {

		Statistics statistics = statisticsDao.getLicensesThisYear();

		if (UtilLib.isEmpty(statistics)) {
			throw new DataNotFoundException("No statistics retrieved");
		}
		return statistics;
	}

	@Transactional(readOnly = true)
	@Override
	public Statistics getRegistrationsThisYear() throws DataNotFoundException {

		Statistics statistics = statisticsDao.getRegistrationsThisYear();

		if (UtilLib.isEmpty(statistics)) {
			throw new DataNotFoundException("No statistics retrieved");
		}
		return statistics;
	}

	@Transactional(readOnly = true)
	@Override
	public Statistics getStartingEndingLessonsPerMonthThisYear() throws DataNotFoundException {

		Statistics statistics1 = statisticsDao.getStartingLessonsPerMonthForThisYear();
		Statistics statistics2 = statisticsDao.getEndingLessonsPerMonthForThisYear();

		if (UtilLib.isEmpty(statistics)) {
			throw new DataNotFoundException("No statistics retrieved");
		}
		return statistics;
	}

}