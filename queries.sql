## Part 1: Test it with SQL
SQL table job: column name, data type:
- id, int
- employer, varchar
- name, varchar
- skills, varchar

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE (location = "St. Louis, MO")

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.skills_id IS NOT NULL
ORDER BY name ASC