import React from 'react';
import { Row, Col, Table } from 'react-bootstrap';

export default function SchoolCompareDashboard(props) {
    return (
        <>
            <Row className='mt-2'>
                <Col className='text-center' md={{ span: 10, offset: 1 }} xs={{ span: 10, offset: 1 }}>
                    <Table striped bordered hover>
                        <thead>
                            <tr>
                                <th></th>
                                <th>{props.schoolOneName}</th>
                                <th>{props.schoolTwoName}</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Enrollment</td>
                                <td>{props.schoolOne.enrollment}</td>
                                <td>{props.schoolTwo.enrollment}</td>
                            </tr>
                            <tr>
                                <td>Ela Score</td>
                                <td>{props.schoolOne.elaScore}</td>
                                <td>{props.schoolTwo.elaScore}</td>
                            </tr>
                            <tr>
                                <td>Math Score</td>
                                <td>{props.schoolOne.mathScore}</td>
                                <td>{props.schoolTwo.mathScore}</td>
                            </tr>
                        </tbody>
                    </Table>
                </Col>
            </Row>
        </>
    );
}