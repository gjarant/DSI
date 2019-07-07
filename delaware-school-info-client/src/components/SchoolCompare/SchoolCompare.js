import React from 'react';
import SchoolCompareSearch from '../SchoolCompareSearch/SchoolCompareSearch';
import SchoolCompareDashboard from '../SchoolCompareDashboard/SchoolCompareDashboard';
import { Container } from 'react-bootstrap';

export default class SchoolCompare extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            error: null,
            schoolOne: [],
            schoolTwo: [],
            options: [],
            schoolOneId: '',
            schoolTwoId: '',
            schoolOneName: '',
            schoolTwoName: ''
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/api/schools")
            .then(res => res.json())
            .then(
                (result) => {
                    this.setState({
                        options: result
                    });
                },
                (error) => {
                    this.setState({
                        error
                    });
                }
            )
    }

    getSchoolInfoOne(schoolId) {
        if (schoolId !== '') {
            fetch(`http://localhost:8080/api//schoolinfo/${schoolId}`)
                .then(res => res.json())
                .then(
                    (result) => {
                        this.setState({
                            schoolOne: result
                        });
                    },
                    (error) => {
                        this.setState({
                            error
                        });
                    }
                )
        }
    }

    getSchoolInfoTwo(schoolId) {
        if (schoolId !== '') {
            fetch(`http://localhost:8080/api//schoolinfo/${schoolId}`)
                .then(res => res.json())
                .then(
                    (result) => {
                        this.setState({
                            schoolTwo: result
                        });
                    },
                    (error) => {
                        this.setState({
                            error
                        });
                    }
                )
        }
    }

    newSelectionOne = (newSelection) => {
        this.setState({
            schoolOneId: newSelection,
            schoolOneName: this.getSchoolName(newSelection)
        });
        this.getSchoolInfoOne(newSelection);
    }

    newSelectionTwo = (newSelection) => {
        this.setState({
            schoolTwoId: newSelection,
            schoolTwoName: this.getSchoolName(newSelection)
        });
        this.getSchoolInfoTwo(newSelection);
    }


    getSchoolName(schoolId) {
        if(schoolId === ''){
            return ''
        }
        return this.state.options.filter(school => school.id === schoolId)[0].schoolName;
    }

    render() {
        return (
            <>
                <Container>
                    <SchoolCompareSearch onClickSelectionOne={this.newSelectionOne} onClickSelectionTwo={this.newSelectionTwo} optionsTypeAhead={this.state.options} />
                    {this.state.schoolOneId === '' || this.state.schoolTwoId === '' ?
                        (
                            <div></div>
                        )
                        :
                        (
                            <SchoolCompareDashboard
                                schoolOneId={this.state.schoolOneId} schoolTwoId={this.state.schoolTwoId}
                                schoolOneName={this.state.schoolOneName} schoolTwoName={this.state.schoolTwoName}
                                schoolOne={this.state.schoolOne} schoolTwo={this.state.schoolTwo}
                            />
                        )}
                </Container>
            </>
        );
    }
}